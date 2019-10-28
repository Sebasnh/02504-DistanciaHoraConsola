/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        int horaActual;
        int minutosActual;
        int segundosActual;

        int horaInicio;
        int minutosInicio;
        int segundosInicio;

        Calendar cal = Calendar.getInstance();

        horaActual = cal.get(Calendar.HOUR_OF_DAY);
        minutosActual = cal.get(Calendar.MINUTE);
        segundosActual = cal.get(Calendar.SECOND);

        try {

            System.out.print("Hora Inicio .....: ");
            horaInicio = SCN.nextInt();

            System.out.print("Minutos Inicio .....: ");
            minutosInicio = SCN.nextInt();

            System.out.print("Segundos Inicio .....: ");
            segundosInicio = SCN.nextInt();

            int tiempoActual = horaActual * 3600 + minutosActual * 60 + segundosActual;

            int tiempoInicio = horaInicio * 3600 + minutosInicio * 60 + segundosInicio;

            int tiempoDiferencia = tiempoActual - tiempoInicio;

            int segundosDistancia = tiempoDiferencia;

            int minutosDistancia = segundosDistancia / 60;

            segundosDistancia = segundosDistancia % 60;

            int horaDistancia = minutosDistancia / 60;

            minutosDistancia = minutosDistancia % 60;

            System.out.printf("Hora Actual .....: %02d:%02d:%02d%n", horaActual, minutosActual, segundosActual);
            System.out.printf("Hora Inicio .....: %02d:%02d:%02d%n", horaInicio, minutosInicio, segundosInicio);
            System.out.printf("Tiempo de clase .....: %02d:%02d:%02d%n", horaDistancia, minutosDistancia, segundosDistancia);

        } catch (Exception e) {
            System.out.println("Error de entrada");

        }

    }

}
