package care.nursing.nursingcare

class DataBaseFake {

    object CardViewInformation{
        var name : String? = null
        var schedule : String? = null
        var date : String? = null
        var direction : String? = null
        var photo :Int = R.drawable.one
    }

    val names = arrayOf("Pedro Perez", "Juan Manuel", "Diego Ramirez", "Javier Navarro", "Benito Camelas")
    val schedules = arrayOf("L-V 09:00 - 18:00", "M-J 07:00 - 08:00", "S-D 08:00 - 15:00", "M-V 07:00 - 08:00", "M-S 07:00 - 08:00")
    val dates =  arrayOf ("01/09/18", "15/19/18" , " 22/08/18" , "30/09/18", "15/10/18")
    val directions = arrayOf ("Daniel #22","Pedro #48","Miguel #53","Jorge #55","Pipila #101")
    val photos = arrayOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.one, R.drawable.two)

   /* public final fun getNames(): Array<String> {
        return names
    }

    public final fun getSchedules(): Array<String> {
        return schedules
    }

    public final fun getDates(): Array<String> {
        return dates
    }

    public final fun getDirections(): Array<String> {
        return directions
    }
*/
}