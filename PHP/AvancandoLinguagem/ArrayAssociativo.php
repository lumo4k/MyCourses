<?php

$conta1 = [
    'titular' => "Luan",
    'saldo' => 2000.00
];

$conta2 = [
    'titular' => "Amanda",
    'saldo' => 2000.00
];

$conta3 = [
    'titular' => "Maria",
    'saldo' => 2000.00
];

$contasCorrentes = [$conta1, $conta2, $conta3];

for ($i=0; $i < count($contasCorrentes); $i++) { 
    echo $contasCorrentes[$i]['titular'] . PHP_EOL . $contasCorrentes[$i]['saldo'] . PHP_EOL;
}