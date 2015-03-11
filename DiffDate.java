public class DiffDate{
	public static void main(String[] args){
		isOneYear("29/02/2011", "01/03/2012");
	}
	public static boolean isOneYear(String dataDa, String dataA)  {
	        try {
	        	System.out.println("dataDa : " + dataDa);
	        	System.out.println("dataA  : " + dataA);
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.println("dataDa: " + dataDa.substring(6,10) + ", " + dataDa.substring(3,5) + ", " + dataDa.substring(0,2));
				System.out.println("dataA: " + dataA.substring(6,10) + ", " + dataA.substring(3,5) + ", " + dataA.substring(0,2));
				
				Date data_da = format.parse(dataDa);
				Date data_a = format.parse(dataA);
				
				long timeDa = data_da.getTime();
				long timeA = data_a.getTime();
				long diff = timeA - timeDa;
				long ggTrasc = diff/(24*60*60*1000);
				System.out.println("timeDa: " + timeDa + ", timeA: " + timeA + ", diff(timeA - timeDa): " + diff);
	
				if(ggTrasc <= 365){
					System.out.println("meno di un anno");
					return true;
				} else {
					System.out.println("piu di un anno");
					return false;
				}
	
	        } catch ( ParseException e ) {
	        	System.out.println(e.getMessage());
	        	e.printStackTrace();
	            return false;
	        }
	}
}
