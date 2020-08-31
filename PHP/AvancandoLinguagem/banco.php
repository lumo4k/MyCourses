<?php

include 'funcoes.php';


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

$conta1 = sacar($conta1, 500);
$conta1 = Depositar($conta1, 750);

echo $conta1['saldo'];