import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args)throws RemoteException {
		
	KPSPublicSoapProxy kpspublic = new KPSPublicSoapProxy();
	boolean result=kpspublic.TCKimlikNoDogrula(Long.parseLong("tc numarasý"),
			"AD(BÜYÜK)", "SOYAD(BÜYÜK)", 1998);
	System.out.println("Doðrulama: "+(result ? "Baþarýlý":"Baþarýsýz"));

	}

}
