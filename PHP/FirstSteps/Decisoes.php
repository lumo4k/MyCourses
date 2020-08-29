<?php

$idade = 22;
$nome = "Luan";
$acompanhado = true;

if ($idade >= 18) {
    echo "$nome, Você tem $idade anos" . PHP_EOL;
    echo "Você pode entrar";
}

elseif ($idade < 18 && $acompanhado) {
    echo "$nome, Você tem $idade anos, mas você está acompanhado!" . PHP_EOL;
    echo "Você pode entrar";
}

else {
    echo "$nome, Você tem $idade anos" . PHP_EOL;
    echo "Você não pode entrar";
}