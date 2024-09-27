public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Metodo de Ordenamiento");
        MetodosOrdenamiento mo = new MetodosOrdenamiento();
        int[] arreglo = new int[] {10,5,8,2,0};
        int[] arregloOr = mo.sortBySelection(arreglo);
        mo.printArreglo(arregloOr);
    }
}
