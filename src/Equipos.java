public class Equipos extends SFutbol{
    String equipof;
    public Equipos(int id, String nombre, String lugar, String posicion,String equipof){
        super(id, nombre, lugar,posicion);
        this.equipof=equipof;
    }
    public String getEquipof() {
        return equipof;
    }
    public String añadirinfo(){
        String añadirinfo=(this.getId()+this.getNombre()+this.getLugar()+this.getPosicion()+this.getEquipof());
        return añadirinfo;
    }

}
