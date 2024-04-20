import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Atributos> ListaArticulos = new ArrayList<Atributos>();

    public static void main(String[] args) {

        MenuPrincipal();
    }

    private static void MenuPrincipal() {
        Scanner sn = new Scanner(System.in);
        while (true) {
            menuInterfaz();
            int opcion = sn.nextInt();
            sn.nextLine();
            try {
                if (opcion == 0) {
                    System.out.println("hasta pronto");
                    break;

                }
                switch (opcion) {
                    case 1:
                        crearArticulo();
                        break;
                    case 2:
                        modificarArticulo();

                        break;
                    case 3:
                        consultarArticulos();
                        break;
                    case 4:
                        consultarUnArticulo();
                        break;
                    default:
                        System.out.println("escoga una opcion valida");
                        break;

                }
            } catch (Exception e) {
                System.out.println("escoga un dato valido");
            }

        }


    }

    private static void consultarUnArticulo() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el codigo del articulo a mostrar:");
        String codigo  = sn.nextLine();


        for (int i = 0; i < ListaArticulos.size(); i++) {

            if (ListaArticulos.get(i).getCodigo().equals(codigo)){
                Atributos art = ListaArticulos.get(i);
                //Imprimiendo los datos

                System.out.println("Nombre: "+art.getNombre());
                System.out.println("Codigo: "+art.getCodigo());
                System.out.println("Modelo: "+art.getModelo());
                System.out.println("Precio: "+art.getPrecio());
                System.out.println("Descripcion: "+art.getDescripcion());
                System.out.println("Salario base del empleado en USD: $"+art.getPrecio());

                return;
            }else{
                System.out.println("no se encontro el articulo");
            }
        }
    }

    private static void consultarArticulos() {
        Scanner sn = new Scanner(System.in);

        for (int i = 0; i < ListaArticulos.size(); i++) {
            Atributos art = ListaArticulos.get(i);
            System.out.println("---------------------------");
            System.out.println(
                    (i + 1)
                            + "\t|Nombre" + art.getNombre()
                            + "\t|Codigo" + art.getCodigo()
                            + "\t|Modelo" + art.getModelo()
                            + "\t|Precio" + art.getPrecio()
                            + "\n|Descripcion: " + art.getDescripcion()
            );
        }
        System.out.println("\n");
    }

    private static void modificarArticulo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("escribe el codigop del producto que deseea modificar:");
        String codigo = sn.nextLine();
        for (int i = 0; i < ListaArticulos.size(); i++) {
            if (ListaArticulos.get(i).getCodigo().equals(codigo)) {

                System.out.println("ingrese el nuevo nombre del articulo:");
                String newNombre = sn.nextLine();
                ListaArticulos.get(i).setNombre(newNombre);
                System.out.println("se ha actualizado el nombre exitosamente");
            } else {
                System.out.println("no se encontro el articulo");
            }
        }
    }

        public static void crearArticulo () {
            Scanner sn = new Scanner(System.in);
            Atributos atributos = null;
            String nombre;
            String Modelo;
            String codigo;
            float precio;
            String descripcion;
            System.out.println("Escriba el nombre del articulo:");
            nombre = sn.nextLine();
            System.out.println("Escriba el modelo del articulo:");
            Modelo = sn.nextLine();
            System.out.println("Escriba el codigo del articulo:"); //puse codigo para despues saber a cual modificar
            codigo = sn.nextLine();
            System.out.println("Escriba el precio del articulo:");
            precio = sn.nextFloat();
            sn.nextLine();
            System.out.println("Escriba la descripcion del articulo:");
            descripcion = sn.nextLine();


            switch (MenuArticulo()) {
                case 1:

                    System.out.println("Escriba el numero de telefono ####-####:");
                    String numTe = sn.nextLine();
                    atributos = new telefono(nombre, Modelo, codigo, precio, descripcion, numTe);
                    break;
                case 2:
                    System.out.println("Escriba el nombre del Mouse (marca):");
                    String nombreMouse = sn.nextLine();
                    atributos = new telefono(nombre, Modelo, codigo, precio, descripcion, nombreMouse);
                    break;

            }
            ListaArticulos.add(atributos);
        }


    private static int MenuArticulo() {
        Scanner sn = new Scanner(System.in);
        try {
            System.out.println("Es un telefono o un laptod?:");
            System.out.println("1.telefono");
            System.out.println("2.laptod");
            System.out.println("opcion >");
            int opcion = sn.nextInt();
            return opcion;
        } catch (Exception e) {
            System.out.println("escoga una opcion disponible");
            return 0;
        }
    }

    private static void menuInterfaz() {
        System.out.println("Escoga una opcion:");
        System.out.println("1.Crear articulo");
        System.out.println("2.Modificar articulo");
        System.out.println("3.Consultar articulos");
        System.out.println("4.Consultar un solo articulo");
        System.out.println("0.salir");
        System.out.println("Opcion > ");
    }


}