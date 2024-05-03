# Sistema de Streaming de Peliculas y Series utilizando Java y  [Intellij IDEA Community](https://www.jetbrains.com/idea/download/?section=linux)
> Curso de [Alura Latam](https://www.youtube.com/@AluraLatam)
<p align="center">
  <img src="https://i.imgur.com/zIFE9XC.png">
</p>

## Aplicando Programacion Orientada a Objetos (POO)
<p>En este sistema se utilizo el polimorfismo, herencia y el encapsulamiento.</p>

La programación orientada a objetos (POO) es como jugar con bloques de construcción donde cada bloque es como una pequeña pieza que puede hacer cosas especiales. Las piezas se llaman "objetos" y tienen sus propias reglas y habilidades. Con la POO, puedes organizar estas piezas juntas para hacer cosas más grandes y divertidas en tu computadora.


## Aplicacion del Encapsulamiento
El encapsulamiento fue utilizado cuando agregamos un modificador de acceso privado en nuestros `Atributos`

- Agregamos las siguientes variables en la clase Titulo:
``` Java
private String nombre;
private int fechaLanzamiento;
private boolean includioEnElPlanBasico;
private int duracionEnMinutos;
```

## Herencia
La Clase Serie y Pelicula heredaron todo los atributos, metodos getter ans setters, y los metodos personalizados que lo hayamos agregado.

- Para utilizar la herencia debemos poner a siguiente palabra `Extends`
``` Java
public class Pelicula extends Titulo
public class Serie extends Titulo
```

## Polimorfismo
La Clase Titulo tiene un metodo getter que es DuracionEnMinutos, en el cual en la clase serie, esta sobreescribiendo este metodo y dandole un nueva funcionalidad.
- Para sobreescibir este metodo usamos `Override`
``` Java
public class Titulo{
  private int duracionEnMinutos;
  public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
}
``` 
- Clase Serie

``` Java
public class Serie extends Titulo{
      @Override
    public int getDuracionEnMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.duracionEnMinutosPorEpisodio;
    }
}
```

## Impresion del Programa 

- Peliculas
``` Java
Ficha técnica de Pelicula
Nombre: Avengers
Fecha de Lanzamiento: 2012
Incluido en el Plan Básico: true
Duración en Minutos: 143
Director: Joss Whedon
```
- Series
``` Java
Ficha técnica de Serie
Nombre: One Piece
Fecha de Lanzamiento: 1999
Incluido en el Plan Básico: true
Temporadas: 22
Episodios por Temporada: 100
Duración en Minutos por Episodio: 25
Duración Total en Minutos: 55000
```
- Calculo Total para ver un maraton de una serie
``` Java
Ingresa el nombre
I'm the Villainess, So I'm Taming the Final Boss
Ingresa el año de lanzamiento
2022
¿Está incluida en el plan básico? (true/false)
true
Ingresa el número de temporadas
1
Ingresa el número de episodios por temporada
12
Ingresa la duración en minutos por episodio
24
Ingresa el número de horas diarias que verías la serie
1
Para ver la serie I'm the Villainess, So I'm Taming the Final Boss
Te tomaría 4 días y 0 horas ver la serie
```
