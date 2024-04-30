# Mi Primera Aplicacion en Java utilizando [Intellij IDEA Community](https://www.jetbrains.com/idea/download/?section=linux)
> Curso de [Alura Latam](https://www.youtube.com/@AluraLatam)
<p align="center">
  <img src="https://i.imgur.com/uVZ17jP.png">
</p>

## Scanner
<p>Se Utilizo Scanner para poder pedirle al usuario los datos, y todo ello se almacene en teclado</p>

- Agregamos el siguiente codigo para usar Scanner
``` Java
import java.util.Scanner;
Scanner teclado = new Scanner(System.in);
```

## Ciclo For
El ciclo For nos permitio hacer que el usuario ingrese por teclado 3 datos, los cuales son las evaluaciones que le daria a la Pelicula de Matrix.
Para el ciclo for funciona con un iterador que esta en 0 y por cada vuelta va incrementando en 1, y tiene una sentencia que menciona que si i el iterador debe ser menor que 3 Si cumple ello , el ciclo termina
``` Java
for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce tu evaluación que le darías a Matrix: ");
            double evaluacionUsuario = teclado.nextDouble();
            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + evaluacionUsuario);
        }
        System.out.println("Media de evaluación de los usuarios: " + mediaEvaluacionUsuario / 3);
    }
```
