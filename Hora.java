import java.util.Scanner; 
public class Hora
{
	private int hora;
	private int min;
	private int seg;

  	private static final Scanner scan = new Scanner(System.in);

	public Hora()
	{
		setHor();
		setMin();
		setSeg();
	}

	public Hora(int h, int m, int s)
	{
		if (h >= 0 && h <= 23 && m >= 0 && m < 60 && s >= 0 && s < 60) {
			this.hora = h;
			this.min = m;
			this.seg = s;
	}else{
			throw new IllegalArgumentException("Hora inválida: " + h + ":" + m + ":" + s);
		}
	}
	public void setHor(int h) {
		if (h >= 0 && h <= 23)
        	this.hora = h;
		else
			throw new IllegalArgumentException("Hora inválida");
    }

	public void setMin(int m) {
        if (m >= 0 && m <= 59)	
			this.min = m;
		else
			throw new IllegalArgumentException("Minuto inválido");
    }

	public void setSeg(int s) {
        if (s >= 0 && s <= 59)	
			this.seg = s;
		else
			throw new IllegalArgumentException("Segundo inválido");
    }

	public void setHor() {
		int resH;
		boolean verificador = false;
        while(!verificador){
		System.out.print("Digite a hora: ");
		try {
			resH = scan.nextInt();
			if(resH <= 23 && resH >= 0)
			{
				this.hora = resH;
				verificador = true;
			}else{
				System.out.println("Valor errado!!! digite novamente!");
				}
		} catch (Exception e)
		{
			System.out.println("Entrada inválida. Digite um número inteiro.");
        	scan.next();
		}
		}
    }

	public void setMin() {
		int resM;
		boolean verificador = false;
		while(!verificador){
        System.out.print("Digite o minuto: ");
		try{
			resM = scan.nextInt();
			if (resM >= 0 && resM < 60)
			{
				this.min = resM;
				verificador = true;
			}else{
				System.out.println("Valor errado!!! digite novamente!");
				}
		} catch (Exception e)
		{
			System.out.println("Entrada inválida. Digite um número inteiro.");
        	scan.next();
		}
		}
    }

	public void setSeg() {
        int resS;
		boolean verificador = false;
		while(!verificador){
        System.out.print("Digite o segundo: ");
		try {
			resS = scan.nextInt();
			if (resS >= 0 && resS < 60)
			{
				this.seg = resS;
				verificador = true;
			}else{
				System.out.println("Valor errado!!! digite novamente!");
				}
		} catch (Exception e)
		{
			System.out.println("Entrada inválida. Digite um número inteiro.");
        	scan.next();
		}
		}
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
		return String.format("%02d:%02d:%02d", hora, min, seg);
	}
     public String getHora2()
	{
	    String periodo = hora < 12 ? "AM" : "PM";
		int hora12 = (hora == 0 || hora == 12) ? 12 : hora % 12;
		return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
	}
	public int getSegundos()
	{
		return ((hora * 3600) + (min * 60) + seg);
	}

	private static int escolherHorario() {
    System.out.print("Selecione o horário que quer mudar (1 a 3): ");
    try {
        int op = scan.nextInt();
        if (op >= 1 && op <= 3) return op;
        else System.out.println("Opção inválida.");
    } catch (Exception e) {
        System.out.println("Entrada inválida.");
        scan.next(); // limpar
    }
	return -1;	
}
	
	public static void main (String[] args) {

	Hora h1 = new Hora();
	Hora h2 = new Hora(13, 49, 25);
	Hora h3 = new Hora(0, 0, 0);
	h3.setHor(1);
	h3.setMin(1);
	h3.setSeg(1);
	int opcao = -1;
	Hora[] horas = { h1, h2, h3 };

	while (opcao != 0) {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Exibir hora (formato 24h)");
        System.out.println("2 - Exibir hora (formato 12h AM/PM)");
        System.out.println("3 - Mostrar total em segundos");
        System.out.println("4 - Alterar hora");
        System.out.println("5 - Alterar minuto");
        System.out.println("6 - Alterar segundo");
        System.out.println("7 - Exibir valores individuais");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

	try {
		opcao = scan.nextInt();
	
	switch (opcao) {
		case 1:
			for (int i = 0; i < horas.length; i++) {
				System.out.println("Hora " + (i + 1) + " (24h): " + horas[i].getHora1());
			}
    break;
		case 2:
			for (int i = 0; i < horas.length; i++) {
				System.out.println("Hora " + (i + 1) + " (12h): " + horas[i].getHora2());
			}
			break;
		case 3:
			for (int i = 0; i < horas.length; i++) {
				System.out.println("Total de segundos: " + horas[i].getSegundos());
			}
			break;
		case 4:
			switch (escolherHorario()){
				case 1:
					h1.setHor();
					break;
				case 2:
					h2.setHor();
					break;
				case 3:
					h3.setHor();
					break;
				}
			break;
		case 5:
			switch (escolherHorario()){
				case 1:
					h1.setMin();
					break;
				case 2:
					h2.setMin();
					break;
				case 3:
					h3.setMin();
					break;
				default:
					System.out.println("ERRO ERRO");
					break;
				}
			break;
		case 6:
			switch (escolherHorario()){
				case 1:
					h1.setSeg();
					break;
				case 2:
					h2.setSeg();
					break;
				case 3:
					h3.setSeg();
					break;
				default:
					System.out.println("ERRO ERRO");
					break;
				}
			break;
		case 7:
			System.out.println("-----------------------");
			System.out.println("Hora h1: " + h1.getHor());
			System.out.println("Minuto h1: " + h1.getMin());
			System.out.println("Segundo h1: " + h1.getSeg());
			System.out.println("-----------------------");
			System.out.println("Hora h2: " + h2.getHor());
			System.out.println("Minuto h2: " + h2.getMin());
			System.out.println("Segundo h2: " + h2.getSeg());
			System.out.println("-----------------------");
			System.out.println("Hora h3: " + h3.getHor());
			System.out.println("Minuto h3: " + h3.getMin());
			System.out.println("Segundo h3: " + h3.getSeg());
			System.out.println("-----------------------");
			break;
		case 0:
			System.out.println("Encerrando programa...");
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scan.next();
        }
    }	
	scan.close();
	}
}
