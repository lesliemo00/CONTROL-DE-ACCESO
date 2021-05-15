//Leslie Morales
<?php
$bd;

function conectar(){
    try{
        global $bd;
        $bd = new mysqli("localhost","root", "","crudphpjson");
        //return $bd;
    } catch (Exception $ex) {
            $msq = array("mensaje" => $error->getMessage());
            throw new Exception($msg);
    }
}
function consultar($sql){
    global $bd;
    $res = NULL;
    try{
        if($bd == NULL){
            conectar();
        }
        return $bd -> query($sql);
    } catch (Exception $error) {
        $msg = array ("mensaje" => $error -> getMessage());
        throw new Exception($msg);
    }
}