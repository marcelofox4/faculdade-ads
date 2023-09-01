package br.com.marceloraposo.application;

import br.com.marceloraposo.domain.SensorGasCarbonico;
import br.com.marceloraposo.domain.SensorTemperatura;
import br.com.marceloraposo.domain.SensorUmidade;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjetoBiosferaDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SensorGasCarbonico sensorGasCarbonico = new SensorGasCarbonico();
        sensorGasCarbonico.inicializar();

        SensorUmidade sensorUmidade = new SensorUmidade();
        sensorUmidade.inicializar();

        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        sensorTemperatura.inicializar();

        System.out.println();
        System.out.println("                                             BEM-VINDO AO SISTEMA DE MONITORAMENTO DO PROJETO BIOSFERA 2");
        System.out.println();

        int opcao = 0;
        while (true) {

            try {
                System.out.println("Qual dos Sensores você deseja visualizar os dados: ");
                System.out.println("[ 1 ] Sensor de TEMPERATURA");
                System.out.println("[ 2 ] Sensor de UMIDADE");
                System.out.println("[ 3 ] Sensor de GÁS CARBÔNICO");
                System.out.println("[ 0 ] Sair do Sistema");
                System.out.print("Digite sua Opção: ");
                opcao = scanner.nextInt();
                System.out.println();

                if (opcao == 0) {
                    break;

                } else if (opcao == 1) {
                    sensorTemperatura.imprimir();
                    System.out.println();
                    System.out.println("Deseja Ordenar os Dados?");
                    System.out.println("[ 1 ] SIM");
                    System.out.println("[ 2 ] NÃO");
                    opcao = scanner.nextInt();
                    System.out.println();
                    if (opcao == 1) {
                        sensorTemperatura.ordenarDados();
                        System.out.println();
                    } else if (opcao == 2) {
                        continue;
                    } else {
                        System.out.println("Opção Inválida!!!");
                    }

                } else if (opcao == 2) {
                    sensorUmidade.imprimir();
                    System.out.println();
                    System.out.println("Deseja Ordenar os Dados?");
                    System.out.println("[ 1 ] SIM");
                    System.out.println("[ 2 ] NÃO");
                    opcao = scanner.nextInt();
                    System.out.println();
                    if (opcao == 1) {
                        sensorUmidade.ordenarDados();
                        System.out.println();
                    } else if (opcao == 2) {
                        continue;
                    } else {
                        System.out.println("Opção Inválida!!!");
                    }

                } else if (opcao == 3) {
                    sensorGasCarbonico.imprimir();
                    System.out.println();
                    System.out.println("Deseja Ordenar os Dados?");
                    System.out.println("[ 1 ] SIM");
                    System.out.println("[ 2 ] NÃO");
                    opcao = scanner.nextInt();
                    System.out.println();
                    if (opcao == 1) {
                        sensorGasCarbonico.ordenarDados();
                        System.out.println();
                    }  else if (opcao == 2) {
                        continue;
                    } else {
                        System.out.println("Opção Inválida!!!");
                    }
                } else {
                    System.out.println("Opção inválida!");
                    System.out.println("Tente novamente.");
                }
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.err.println("Digite uma opção válida!!!");
            }
        }
    }
}
