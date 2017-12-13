package net.torora.jtam.noteapp

/**
 * Created by jtam on 12/14/17.
 */
class Note{
    var nodeID:Int?=null
    var nodeName:String?=null
    var nodeDes:String?=null
    constructor(nodeID:Int, nodeName:String, nodeDes:String){
        this.nodeID=nodeID
        this.nodeName=nodeName
        this.nodeDes=nodeDes
    }
}