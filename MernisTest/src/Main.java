import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args)throws RemoteException {
		
	KPSPublicSoapProxy kpspublic = new KPSPublicSoapProxy();
	boolean result=kpspublic.TCKimlikNoDogrula(Long.parseLong("tc numaras�"),
			"AD(B�Y�K)", "SOYAD(B�Y�K)", 1998);
	System.out.println("Do�rulama: "+(result ? "Ba�ar�l�":"Ba�ar�s�z"));

	}

}
