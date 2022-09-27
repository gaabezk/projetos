import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "", cargo;
        double salarioBruto, valeTransporte, planoDeSaude, inss, calculoFaltas, calculoHorasExtras, calculoSalarioFamilia, valorVenda, calculoVenda;
        int numFaltas, horasExtras, numDependentes, continuar = 0;
        double valorSalarioFamilia = 56.47;

        while (continuar == 0) {
            try {
                nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
                if (nome.equals("")) {
                    JOptionPane.showMessageDialog(null, "Voce precisa digitar um nome", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario "));
                if (salarioBruto <= 0) {
                    JOptionPane.showMessageDialog(null, "O campo nao pode ser negativo ou nulo", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                continuar = 0;
                numFaltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de faltas: "));
                if (numFaltas > 31 || numFaltas < 0) {
                    JOptionPane.showMessageDialog(null, "O numero de dias nao pode ser maior que 31", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                horasExtras = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de horas extras: "));
                if (horasExtras < 0) {
                    JOptionPane.showMessageDialog(null, "O valor nao pode ser negativo", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                numDependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de Dependentes: "));
                if (numDependentes < 0) {
                    JOptionPane.showMessageDialog(null, "O valor nao pode ser negativo", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O campo nao pode ser nulo", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                break;

            }

            cargo = JOptionPane.showInputDialog(null, "Digite o cargo: ");

            valeTransporte = salarioBruto * 0.06; // 6%
            planoDeSaude = salarioBruto * 0.01 + 50; // 1% + 50
            inss = salarioBruto * 0.11; //11%
            calculoFaltas = salarioBruto / 30 * numFaltas;
            calculoHorasExtras = salarioBruto * 0.01 * horasExtras;
            calculoSalarioFamilia = numDependentes * valorSalarioFamilia;

            while (cargo.equals("dev")) {
                valorVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da venda: "));
                if (valorVenda < 0) {
                    JOptionPane.showMessageDialog(null, "Digite um valor válido", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                    break;
                } else if (valorVenda > 0) {
                    calculoVenda = valorVenda * 0.10;
                    double salarioLiquido = (salarioBruto - valeTransporte - planoDeSaude - inss - calculoFaltas + calculoHorasExtras + calculoVenda + calculoSalarioFamilia);
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome +
                                    "\nSalário Bruto: R$" + salarioBruto +
                                    "\nFaltas: " + numFaltas +
                                    "\nHoras Extras: " + horasExtras +
                                    "\nDependentes: " + numDependentes +
                                    "\nComissão: R$" + String.format("%.2f", calculoVenda) +
                                    "\nDescontos: R$" + String.format("%.2f", (valeTransporte + planoDeSaude + inss + calculoFaltas)) +
                                    "\nSalário Liquido: R$" + String.format("%.2f", salarioLiquido));
                    cargo = "nenhum";
                }
            }
            if (cargo.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "\nNome: " + nome +
                                "\nSalário Bruto: R$" + salarioBruto +
                                "\nFaltas: " + numFaltas +
                                "\nHoras Extras: " + horasExtras +
                                "\nDependentes: " + numDependentes +
                                "\nDescontos: R$" + String.format("%.2f", (valeTransporte + planoDeSaude + inss + calculoFaltas)) +
                                "\nSalário Liquido: R$" + String.format("%.2f", (salarioBruto - valeTransporte - planoDeSaude - inss - calculoFaltas + calculoHorasExtras + calculoSalarioFamilia)));
            } else if (cargo != "nenhum") {
                JOptionPane.showMessageDialog(null, "Digite um cargo válido ou deixe em branco", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
                break;
            }
            continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer outro calculo?");

            if (continuar != 0) {
                JOptionPane.showMessageDialog(null, "Programa encerrado!", "Folha de Pagamento", JOptionPane.ERROR_MESSAGE);
            }
        }

        sc.close();
    }
}