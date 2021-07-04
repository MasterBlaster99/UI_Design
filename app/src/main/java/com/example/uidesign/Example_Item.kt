package com.example.uidesign

class Example_Item {

    private  var resource:Int?= null
    private  var text:String?= null

    fun getText():String?{
        return text
    }
    fun getResource():Int?{
        return resource
    }
    fun setResource(inResource:Int){
        resource = inResource
    }
    fun setText(inText:String){
        text = inText
    }
}