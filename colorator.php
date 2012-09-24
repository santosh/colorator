<!DOCTYPE html>
<html>
<head>
        <title> Colorator </title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width">
        <link href='http://fonts.googleapis.com/css?family=Nunito:700' rel='stylesheet' type='text/css'>
<?php // {{
    $rand = array('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f');
    $color1 = '#'.$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)];
    $color2 = '#'.$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)];
    $color3 = '#'.$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)];
    $color4 = '#'.$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)].$rand[rand(0,15)];
// }}?>

        <style type="text/css"> 
            body, html { height: 100%; padding: 0; margin: 0; }
            div { width: 50%; height: 50%; float: left; display: table; -webkit-transition: all 500ms; transition: all 500ms; }
            div:hover { -o-box-shadow: inset 0 0 40px #000000; -ms-box-shadow: inset 0 0 40px #000000; -moz-box-shadow: inset 0 0 40px #000000; -webkit-box-shadow: inset 0 0 40px #000000; box-shadow: inset 0 0 40px #000000; }
            h1 { display: table-cell; text-align: center; vertical-align: middle; font-family: 'Nunito', sans-serif; font-size: 3em; } 
            #div1 { background: <?php echo $color1; ?>; }
            #div2 { background: <?php echo $color2; ?>; }
            #div3 { background: <?php echo $color3; ?>; }
            #div4 { background: <?php echo $color4; ?>; }
        </style>

</head>
<body id="workspace">
  
    <div id="div1"> <h1> <?php echo $color1; ?> </h1> </div>
    <div id="div2"> <h1> <?php echo $color2; ?> </h1> </div>
    <div id="div3"> <h1> <?php echo $color3; ?> </h1> </div>
    <div id="div4"> <h1> <?php echo $color4; ?> </h1> </div>
    
    <script type="text/javascript">// {{
window.onload = function(){
    document.getElementById('workspace').oncontextmenu = function(){
        return false;
    }
}

function click(e) {
    if (navigator.appName == 'Netscape' && e.which == 3) {
        window.location.reload();
        return false;
  } else {
    if (navigator.appName == 'Microsoft Internet Explorer' && event.button==2) {
        window.location.reload();
        return false;
        }
    }
   return true;
}
document.onmousedown=click;
// }}</script>
</body>
</html>
