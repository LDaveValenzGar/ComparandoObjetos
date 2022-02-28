# ComparandoObjetos
Entregable Comparando Objetos POO
Instrucciones
Tomando como base el proyecto InterfaceBasics alojado en el repositorio del curso, 
realizar las modificaciones necesarias para permitir que los objetos creados a partir de las clases Circle y Rectangle 
sean comparables contra otro objeto similar. La modificación debe permitir realizar lo siguiente:

        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (15, 15, 21);
        
        int resultCircles = circle1.compareTo (circle2);
        
        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);
        
        int resultRecs = rec1.compareTo (rec2);
