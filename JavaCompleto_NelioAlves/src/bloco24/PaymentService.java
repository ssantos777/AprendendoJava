package bloco24;

import java.time.LocalDate;

public class PaymentService {
	
	private Integer installmentsNumber;
	
	private PaymentInterface paymentInterface;
	
	
	
	public PaymentService(Integer installmentsNumber, PaymentInterface paymentInterface) {
		this.installmentsNumber = installmentsNumber;
		this.paymentInterface = paymentInterface;
	}

	public void processContract(Contract contract) {
		Double parcela = 0.0;
		
		int aux = 0;
		LocalDate contractDate = contract.getContractDate();
		Integer month = contractDate.getMonthValue();
		Integer year = contractDate.getYear();
			
		for (int i = 1; i <= installmentsNumber; i++) {
		
			parcela = contract.getTotalValue() / installmentsNumber;
			
			LocalDate installmentDate = null;
			
			if (month + i > 12) {
				month = 0;
				aux += 1;
				installmentDate = contractDate.withMonth(month + aux).withYear(year + 1);
				aux++;
			} else {
				installmentDate = contractDate.withMonth(month + i);
			}
			
			parcela = paymentInterface.paymentTax(parcela, i);
			
			contract.addInstallment(new Installment(installmentDate, parcela));
		}
	}
	
}