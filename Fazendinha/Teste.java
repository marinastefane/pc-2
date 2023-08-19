package fazenda;

public class Teste{
    public static void main(String[] args) {
        
        //vacas
        Vaca vaca1 = new Vaca();
        vaca1.setNome("Mimosa");
        vaca1.setCorPelo("Branca");
        vaca1.setConsumo(59);
        vaca1.setLeite("Normal");

        Vaca vaca2 = new Vaca();
        vaca2.setNome("Margarida");
        vaca2.setCorPelo("Preta e Branca");
        vaca2.setConsumo(70);
        vaca2.setLeite("Baixo");

        Vaca vaca3 = new Vaca();
        vaca3.setNome("Petruquia");
        vaca3.setCorPelo("Marrom");
        vaca3.setConsumo(65);
        vaca2.setLeite("Acima");

        double consumoTotalVacas;
        consumoTotalVacas = vaca1.getConsumo() + vaca2.getConsumo() + vaca3.getConsumo();
        System.out.println ("Racao total mensal para gado: " + consumoTotalVacas + " Kg");

        //cavalos
        Cavalo cavalo1 = new Cavalo();
        cavalo1.setNome("Trovao");
        cavalo1.setCorPelo("Preto");
        cavalo1.setConsumo(80);
        cavalo1.setPeso(470);

        Cavalo cavalo2 = new Cavalo();
        cavalo2.setNome("Relampago");
        cavalo2.setCorPelo("Branco");
        cavalo2.setConsumo(100);
        cavalo2.setPeso(360);

        double consumoTotalCavalos;
        consumoTotalCavalos = cavalo1.getConsumo() + cavalo2.getConsumo();
        System.out.println("Racao total mensal para cavalos: " + consumoTotalCavalos + " Kg");

        //galinhas
        Galinha galinha1 = new Galinha();
        galinha1.setNome("Frida");
        galinha1.setCorPelo("Laranja");
        galinha1.setConsumo(40);
        galinha1.setOvosB(20);

        Galinha galinha2 = new Galinha();
        galinha2.setNome("Magricela");
        galinha2.setCorPelo("Marrom");
        galinha2.setConsumo(26);
        galinha2.setOvosB(8);

        Galinha galinha3 = new Galinha();
        galinha3.setNome("Joana");
        galinha3.setCorPelo("Preta");
        galinha3.setConsumo(36);
        galinha3.setOvosB(27);

        Galinha galinha4 = new Galinha();
        galinha4.setNome("Bolinha");
        galinha4.setCorPelo("Pintada");
        galinha4.setConsumo(44);
        galinha4.setOvosB(18);

        Galinha galinha5 = new Galinha();
        galinha5.setNome("Claudenice");
        galinha5.setCorPelo("Branca");
        galinha5.setConsumo(35);
        galinha5.setOvosB(25);

        double consumoTotalGalinhas;
        consumoTotalGalinhas = galinha1.getConsumo() + galinha2.getConsumo() + galinha3.getConsumo() + galinha4.getConsumo() + galinha5.getConsumo();
        System.out.println("Racao total mensal para galinhas: " + consumoTotalGalinhas + " Kg");

        double consumoTotal;
        consumoTotal = consumoTotalCavalos + consumoTotalVacas + consumoTotalGalinhas;
        System.out.println("Racao total mensal: " + consumoTotal +" Kg");



    }
}
