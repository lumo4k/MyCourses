<?php

$peso = 80;
$altura = 1.80;

echo "Seu IMC é: " . number_format($peso/($altura ** 2), 2);