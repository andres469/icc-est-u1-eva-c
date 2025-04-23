package Controller;

import Models.Book;

public class ControllerBook {
  public void sortByName(Book[] libros) {
    int n=libros.length;
    for (int i = 0; i < libros.length; i++) {
        int indiceMenor=i;
        for (int j = i; j < libros.length-1; j++) {
            if (libros[j].getName().compareTo(libros[indiceMenor].getName())>0 ) {
                indiceMenor=j;
            }
        }
        if (indiceMenor!=i) {
            Book aux=libros[i];
                libros[i]=libros[i+1];
                libros[i+1]=aux;
        }
    } 
}
public Book searchByName(Book[] libros, String name) {
   int inicio=0;
   int fin=libros.length-1;
   while (inicio<fin) {
    int mitad=(inicio+fin)/2;
    String nameMedio=libros[mitad].getName();
    int condit=libros[mitad].getName().compareToIgnoreCase(nameMedio);
    if (condit==0) 
    {
    return libros[mitad];    
    }
    if (condit<0) {
        inicio=mitad+1;
    }else{
        fin=mitad-1;
    }
   }
    return null;
}

}
