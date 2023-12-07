public class Caracteristicas extends Equipos{
    String alineacion;
    String color;

    public Caracteristicas(int id, String nombre, String lugar, String posicion, String equipof, String alineacion, String color) {
        super(id, nombre, lugar, posicion, equipof);
        this.alineacion = alineacion;
        this.color = color;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String segundainfo(){
        String segundainfo=("\nIdentificador: "+this.getId()+"\nNombre: "+this.getNombre()+"\nLugar: "+this.getLugar()+"\nPosicion en la tabla general: "+this.getPosicion()+"\nTecnico: "+this.getEquipof()+"\nAlineación: "+this.getAlineacion()+"\nColores: "+this.getColor());
        return segundainfo;
    }
    public void mostrarinfo2(){
        System.out.println("\n **** Caractersiticas de Equipo **** \n "+segundainfo());
    }
}
