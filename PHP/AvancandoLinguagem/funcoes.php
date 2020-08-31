<?php

function exibeMensagem($menssagem) {
    echo $mensagem . PHP_EOL;
}

function sacar($Conta, $ValorSaque) {
    $Conta['saldo'] -= $ValorSaque;

    return $Conta;
}

function Depositar($Conta, $valorDeposito) {
    $Conta['saldo'] += $valorDeposito;

    return $Conta;
}