import java.util.Scanner; 
public class Hora
{
	private int hora;
	private int min;
	private int seg;

	public Hora()
	{
		setHor();
		setMin();
		setSeg();
	}

	public Hora(int h, int m, int s)
	{
		this.hora = h;
		this.min = m;
		this.seg = s;
	}
	public void setHor(int h) {
        this.hora = h;
    }

	public void setMin(int m) {
        this.min = m;
    }

	public void setSeg(int s) {
        this.seg = s;
    }

	public void setHor() {
		int resH;
		boolean verificador = false;
        Scanner scan = new Scanner(System.in);
        while(!verificador){
		System.out.print("Digite a hora: ");
        resH = scan.nextInt();
		if(resH <= 24 && resH >= 0)
		{
			this.hora = resH;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
        }
    }

	public void setMin() {
		int resM;
		boolean verificador = false;
        Scanner scan = new Scanner(System.in);
		do{
        System.out.print("Digite o minuto: ");
        resM = scan.nextInt();
		if(resM <= 60 && resM >= 0)
		{
			this.min = resM;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
		}while(!verificador);
    }

	public void setSeg() {
        int resS;
		boolean verificador = false;
        Scanner scan = new Scanner(System.in);
		do{
        System.out.print("Digite o segundo: ");
        resS = scan.nextInt();
		if(resS <= 60 && resS >= 0)
		{
			this.seg = resS;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
		}while(!verificador);
    }

	public int getHor() {
        return hora;
    }
	public int getMin() {
        return min;
    }
	public int getSeg() {
        return seg;
    }

    public String getHora1()
	{
		return hora + ":" + min + ":" + seg;
	}
     public String getHora2()
	{
	    int fix = hora;
		if (hora > 12){
			fix -= 12;
			return fix + ":" + min + ":" + seg + " PM";
		}
		else{return hora + ":" + min + ":" + seg + " AM";}
	}
	public int getSegundos()
	{
		return ((hora * 3600) + (min * 60) + seg);
	}
	
	public static void main (String[] args) {

	Hora h1 = new Hora();
	Hora h2 = new Hora(13, 32, 40);
	Hora h3 = new Hora(0, 0, 0);
	h3.setHor(1);
	h3.setMin(1);
	h3.setSeg(1);
	
	
	/*Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite: ");
	placeholder = scan.nextInt();

	scan.close();*/
	
	System.out.println(h1.getHora1());
	System.out.println(h1.getHora2());
	System.out.println(h2.getHora1());
	System.out.println(h2.getHora2());
	System.out.println(h1.getHor());
	System.out.println(h1.getMin());
	System.out.println(h2.getHor());
	System.out.println(h2.getMin());
	System.out.println("h2.getHora2()");
	System.out.println(h3.getHora2());
	System.out.println("segundos :" + h3.getSegundos());
	}
}
