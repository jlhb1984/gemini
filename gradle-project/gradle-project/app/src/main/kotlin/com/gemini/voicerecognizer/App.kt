/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.gemini.voicerecognizer

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
    println("Jose Luis Hurtado Balcazar")
    var dinero=10
    val nombre="Jose"
    val p1=1
    val p2=2
    val p3=p1-p2
    println(p3)
    println("Uso de $: $dinero")
    if (nombre.isNotEmpty()){
        println("Nombre tiene una longitud de ${nombre.length}.")
    }else if(nombre.isEmpty()){
        println("OK!")    
    }else{
        println("Error.")
    }
    
    when (nombre){
        "Jose"->println("Luis")
        "Luis"->println("Migul")
    }

    val code=200
    when (code){
        in 200..299->println("ok")
        in 400..500->println("Not ok")
        else->println("Bad")
    }

    var contador=10
    while (contador>0){
        println("El valor de contador es $contador")
        contador--
    }

    do{
        println("Generando número aleatorio: ")    
        var numeroaleatorio=(0..100).random()   
        println("$numeroaleatorio")
        numeroaleatorio--
    }while (numeroaleatorio>50)

    val lista_frutas=listOf("manzana","pera","frambuesa","durazno")
    for (fruta in lista_frutas){
        println("Hoy comeré $fruta")
    }

    val lista_frutas2=listOf("manzana","pera","frambuesa","durazno")
    for (fruta2 in lista_frutas2){
        println("Hoy comeré $fruta2")
        lista_frutas2.forEach{fruta2->println("Hoy comeré nueva $fruta2")}
    }

    val caracteres_frutas=lista_frutas2.map{fruta2->fruta2.length}
    println(caracteres_frutas)

    val lista_filtrada=caracteres_frutas.filter{caracteres_frutas->caracteres_frutas>5}
    println(lista_filtrada)

    println("!!: double bang.")

    var nombre2 : String?=null
    /*println(nombre?.length)
    */

    try{
        nombre!!.length
    }catch(excepcion:NullPointerException){
        println("Ha ocurrido un error")
    }finally{
        println("Fialmente ha ocurrido un eroror... Cerrando aplicación")
    }


    try{
        throw NullPointerException("Referencia nula")
    }catch(excepcion:NullPointerException){
        println("Ha ocurrido un error")
    }finally{
        println("Fialmente ha ocurrido un eroror... Cerrando aplicación")
    }

    val val1=10
    val val2=0
    val resultado : Int=try{val1/val2} catch (exception:Exception){0}
    println(resultado)

    var nombre3: String?=null
    val caracteres_nombre:Int=nombre3?.length ?:0
    println(caracteres_nombre)

    val lista_nombres=listOf("Juan","Enrrique","Camilo")
    println(lista_nombres)

    val lista_vacia=mutableListOf<String>()
    println(lista_vacia)

    lista_vacia.add("Juan")
    println("lista_vacia: $lista_vacia")

    val valor_usando_get=lista_vacia.get(0)
    println("valor_usando_get: $valor_usando_get")

    val valor_usando_operador=lista_vacia[0]
    println("valor_usando_operador: $valor_usando_operador")

    val primer_valor: String?=lista_nombres.firstOrNull()
    println("primer_valor: $primer_valor")

    lista_vacia.removeAt(0)
    println("lista_vacia: $lista_vacia")

    lista_vacia.add("Enrrique")
    lista_vacia.removeIf{caracteres->caracteres.length>3}
    println("lista_vacia: $lista_vacia")

    val my_array=arrayOf(1,2,3,4)
    println("Nuestro array: $my_array")

    /*Es recomendable usar listas en vez de arrays */
    println("Nuestro array como lista: ${my_array.toList()}")

    var num_de_lot=listOf(11,22,43,56,78,66)
    var num_sorted=num_de_lot.sorted()
    println("num_de_lot ordenada: $num_sorted")
    var num_de_lot2=listOf(11,22,43,56,78,66).sortedDescending()
    println("num_de_lot2 ordenada descendente: $num_de_lot2")       
    var num_sorted_by=num_de_lot2.sortedBy{num_de_lot2 -> num_de_lot2 <50}
    println("num_dsortedBy: $num_sorted_by")    
    var num_shuffled=num_de_lot2.shuffled()
    println("num_de_lot2 shuffled: $num_shuffled")    
    var num_reversed=num_de_lot.reversed()
    println("num_de_lot: $num_de_lot")
    println("num_de_lot reversed: $num_reversed")    
    var men_num=num_de_lot.map{num_de_lot->"Num de lot: $num_de_lot"}
    println("men_num: $men_num")    
    var num_filt=num_de_lot2.filter{num_de_lot2->num_de_lot2>50}
    println("num_de_lot2 filter: $num_filt")

    val edad_superh1=mapOf(
        "Iron_man" to 35,
        "Spiderman" to 23,
        "CapitanA" to 99
    )
    println("Superh1 $edad_superh1")

    val edad_superh2=mutableMapOf(
        "DeadPool" to 35,
        "Guepardo" to 23,
        "Titania" to 99
    )
    println("Superh2 $edad_superh2")

    edad_superh2.put("Ciclope",28)
    println("Superh2 $edad_superh2")

    edad_superh2["Storm"]=28
    println("Superh2 $edad_superh2")

    var edad_Titania=edad_superh2["Titania"]
    println(edad_Titania)

    println(edad_superh2.keys)
    println(edad_superh2.values)
    
    /*
    edad_superh2.remove(key:"Titania")
    println("Superh2 $edad_superh2")
     */

    val vocal_repe=setOf("a","e","i","o","u","a","e","i","o","u")
    println("Sets no permite tener elementos repetidos $vocal_repe")

    val nums=mutableSetOf(1,2,3,4)
    println("nums $nums")
    nums.add(5)
    println("nums $nums")
    nums.remove(4)
    println("nums $nums")

    val val_set=nums.firstOrNull{num3->num3>2}
    println("val_set: $val_set") 

    val fraseal="En Platzi nunca paramos de aprender"
    var frasealord=randomCase(fraseal)
    println(frasealord)

    imprimir_nombre(nombre="Jose",apellido="Hurtado")   
    
    val my_lambda:(String) -> Int = {valor->valor.length}
    val lambda_ejecutada: Int=my_lambda("Hola Platzi")
    print(lambda_ejecutada)
    
    val saludos=listOf("hello","hola","chao")
    val longsal=saludos.map(my_lambda)
    println("longsal $longsal")

    val largo_valor=super_funcion(valor_inicial="Hola",block={valor->valor.length})
    println("largo_valor: $largo_valor")

    /*
    val lambda=fun_incept("Enrrique")
    val val_lambda=String=lambda()
    println(val_lambda)
    */
}


fun randomCase(frase: String): String{
    val numrand=0..99
    val resal=numrand.random()
    if (resal.rem(2)==0){
        return frase.toUpperCase()
    }else{
        return frase.toLowerCase()
    }
}

fun impfra(frase : String): Unit{
    println("Tu frase es: $frase")
}

fun imprimir_nombre(nombre: String, s_nombre: String="",apellido: String){
    println("Mi nombre es $nombre $s_nombre $apellido")
}

fun super_funcion(valor_inicial: String, block:(String)->Int):Int{
    return block(valor_inicial)
}

fun fun_incept(nombre:String): ()->String{
    return{
        "Hola"
    }
}