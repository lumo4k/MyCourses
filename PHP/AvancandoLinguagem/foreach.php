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

foreach ($contasCorrentes as $conta) {
    echo $conta['titular'] . PHP_EOL;
}
