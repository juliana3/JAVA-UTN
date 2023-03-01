//1.a- usando WHILE imprimir todos los nros entre a y b
int inicio = 5;
int fin =14;
int contador= inicio;
while(contador <= fin){
	System.out.printIn(contador);
	contador++;
}


//b- mostrar solo los pares
while(contador <= fin){
    if(contador%2 == 0){
        System.out.printIn(contador);
    }
	contador++;
}

//c- con 1 variable extra elejir si mostrar pares o impares
char mostrar = 'i';
while(contador <= fin){
    if(mostrar == 'p' && contador%2 ==0){
        System.out.printIn(contador);
    }else{
        if(mostrar == 'i' && contador%2 !=0){
            System.out.printIn(contador);
        }
    }
	contador++;
}

//d- usando FOR hacer lo mismo que en b pero invirtiendo el orden
for(int i=fin;i>=inicio;i--){
    if(i%2==0){
        System.out.printIn(i);
    }
}

//2- determinar si una pesona pertenece al segmento de ingresos altos
//para eso debe cumplirse alguno de los sgtes postulados
//- ingresos mensuales totales >= $489.083
//- 3 o mas vehiculos con antiguedad < a 5 años
//- tener 3 o mas inmuebles
//- tener embarcacion, aeronave de lujo o ser titular de activos socie
//tarios

//VARIABLES: float ingresos_mensuales_totales
///int cantidad_vehiculos
//int modelo_vehiculo1 (hasta vehiculo n)
//int anio_actual = 2023
//int cantidad_inmuebles
//bool tiene_barco;
//bool tiene_avion;
//bool tiene_empresa;

float ingresos = 123456;
int cantidad_vehiculos = 5;
int anio_actual = 2023;
int contador_vehiculos_nuevos = 0;
int modelo_vehiculo1 = 2012;
if(anio_actual - modelo_vehiculo1 < 5){contador_vehiculos_nuevos++;}
int modelo_vehiculo2 = 2021;
if(anio_actual - modelo_vehiculo2 <5){contador_vehiculos_nuevos++;}
int modelo_vehiculo3 = 2019;
if(anio_actual - modelo_vehiculo3 <5){contador_vehiculos_nuevos++;}
int modelo_vehiculo4 = 2000;
if(anio_actual - modelo_vehiculo4 <5){contador_vehiculos_nuevos++;}
int modelo_vehiculo5 = 1993;
if(anio_actual - modelo_vehiculo5 <5){contador_vehiculos_nuevos++;}

int cantidad_inmuebles = 1;
bool tiene_barco = false;
bool tiene_avion = false;
bool tiene_empresa = true;

if((ingresos >= 489083)||(contador_vehiculos_nuevos >=3)||
(cantidad_inmuebles >=3)|| tiene_barco || tiene_avion || tiene_empresa){
    System.out.printIn("PERTENECE");
}else{System.out.printIn("NO PERTENECE");}