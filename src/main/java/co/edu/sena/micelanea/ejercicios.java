package co.edu.sena.micelanea;


public class ejercicios {
    public double areaTriangulo(double d1, double d2){
        return (d1 * d2) / 2;
    }
    public double suma(double d1, double d2){
        return (d1 + d2);
    }
    public double elevado(double d1){
        return (d1 * d1);
    }
    public double convertidor(double d1){
        return (d1 * 1.08);
    }
    public String areaperi(double d1) {
        double area = d1 * d1;
        double perimetro = 4 * d1;
        return ("el area del cuadrado es "+area+" y el perimetro es "+perimetro);
    }

    public String volar(double d1, double d2) {
        double area = 2 * Math.PI *d1* (d1+d2);
        double volumen = Math.PI * Math.pow(d1, 2) * d2;
        return ("el area del cilindro es "+area+" y el volumen es "+volumen);
    }

    public String radio(double d1) {
        double longitud = ( 2 * Math.PI * d1);
        double area = ( Math.PI * Math.pow(d1, 2));
        return ("la longidud de la circunferencia es "+longitud+" y el area es "+area);
    }

    public double promedio(double d1, double d2, double d3) {
        return (d1+d2+d3)/3;
    }




    //condicionales
    
    public String positi(double d1){//numero positivo o negativo
    if (d1>=0) {
        return ("positivo"); 
        
    }
    else{
        return ("negativo");
    }
    }
  
  
  
  
    public String maymen(double d1, double d2){//numero mayor y menor
        if (d1>d2) {
            return ("El numero mayor es "+d1+" y el numero menor es "+d2); 
            
        }
        else{
            return ("El numero mayor "+d2+" y el numero menor es "+d1);
        }
        }

    
    
        public String tresmay(double d1, double d2, double d3){//numero mayor entre 3
        if(d1>d2 && d1>d3){
            if(d2>d3){
                  return (+d1+" es el numero mayor y "+d3+" el numero menor");
            }
            else{
                  return(+d1+" es el numero mayor y "+d2+" el numero menor");
            }
      }
      else if(d2>d1 && d2>d3){
            if(d3>d1){   
                  return(+d2+" es el numero mayor y "+d1+" el numero menor");
            }
            else{
                  return(+d2+" es el numero mayor y "+d3+" el numero menor");
            }
      
      }
      else {
      
            if(d2>d1){   
                  return(+d3+" es el numero mayor y "+d1+" el numero menor");
            }
            else{
                  return(+d3+" es el numero mayor y "+d2+" el numero menor");
            }
      
      }

    }
   
    
    public double sumres(double d1, double d2){//dados 2 numero sumarlos o restarlos

        if (d1<d2) {
            return (d1+d2);
        } else {
            return (d1-d2);
        }


    }

    public String divicion(double d1, double d2){//division

        if (d1==0 || d2==0) {
            return ("la division no es posible");
            
        } else {

            double cociente=(d1/d2);
            return ("el resultado de la division es "+cociente);
            
        }

    }

    public String mulsum(double d1, double d2){//suma o multiplicacion

        if (d1<0 || d2<0) {
            double result=(d1+d2);
            return ("Hay un negativo, la suma es "+result);
        } else {
            double result=(d1*d2);
            return ("No hay un negativo, la multiplicacion es "+result);
            
        }
   

    }

    public String añobi(double d1){
        if ((d1 % 4 == 0 && d1 % 100 != 0) || (d1 % 400 == 0)) {
            return(d1 + " es un año bisiesto.");
        } else {
            return (d1 + " no es un año bisiesto.");
        }
    }



}
 