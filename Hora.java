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
		setSeg();;
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
        do{
		System.out.println("Digite a hora: ");
        resH = scan.nextInt();
		if(resH <= 24 && resH >= 1)
		{
			this.hora = resH;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
		}while(verificador);

    }

	public void setMin() {
		int resM;
		boolean verificador = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o minuto: ");
        resM = scan.nextInt();
		if(resM <= 60 && resM >= 1)
		{
			this.min = resH;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
		}while(verificador);
    }

	public void setSeg() {
        int resS;
		boolean verificador = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o segundo: ");
        resM = scan.nextInt();
		if(resS <= 60 && resS >= 1)
		{
			this.seg = resS;
			verificador = true;
		}
		else{System.out.println("Valor errado!!! digite novemente!");}
		}while(verificador);
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
		return (hora, ':', min,':', seg);
	}
     public String getHora2()
	{
		if (hora > 12){
			hora -= 12;
			return (hora, ':', min,':', seg,' PM');
		}
		else{return (hora, ':', min,':', seg,' AM');}
	}
	public int getSegundos()
	{
		return ((hora * 3600) + (min * 60) + seg);
	}
	
	public static void main (String[] args) {

	hora h1 = new hora();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite: ");
	placeholder = scan.nextInt();

	scan.close();*/
	
	}
}