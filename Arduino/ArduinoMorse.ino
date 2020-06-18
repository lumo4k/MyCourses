/*
  This program blinks pin 13 of the Arduino (the
  built-in LED)
*/

void setup()
{
  pinMode(13, OUTPUT);
}

void loop()
{
  String Texto = "Projetos melhor aula";
  delay(1000);
    for(int i = 0; i < Texto.length(); i++) {
      Texto.toUpperCase();
      switch(Texto.charAt(i)) {
      case 'A':
        dits();
        dahs();
        break;
      case 'B':
        dahs();
        dits();
        dits();
        dits();
        break;
      case 'C':
        dahs();
        dits();
        dahs();
        dits();
        break;
      case 'D':
        dahs();
        dits();
        dits();
        break;
      case 'E':
        dits();
        break;
      case 'F':
        dits();
        dits();
        dahs();
        dits();
        break;
      case 'G':
        dahs();
        dahs();
        dits();
        break;
      case 'H':
        dits();
        dits();
        dits();
        dits();
        break;
      case 'I':
        dits();
        dits();
        break;
      case 'J':
        dits();
        dahs();
        dahs();
        dahs();
        break;
      case 'K':
        dahs();
        dits();
        dahs();
        break;
      case 'L':
        dits();
        dahs();
        dits();
        dits();
        break;
      case 'M':
        dahs();
        dahs();
        break;
      case 'N':
        dahs();
        dits();
        break;
      case 'O':
        dahs();
        dahs();
        dahs();
        break;
      case 'P':
        dits();
        dahs();
        dahs();
        dits();
        break;
      case 'Q':
        dahs();
        dahs();
        dits();
        dahs();
        break;
      case 'R':
        dits();
        dahs();
        dits();
        break;
      case 'S':
        dits();
        dits();
        dits();
        break;
      case 'T':
        dahs();
        break;
      case 'U':
        dits();
        dits();
        dahs();
        break;
      case 'V':
        dits();
        dits();
        dits();
        dahs();
        break;
      case 'W':
        dits();
        dahs();
        dahs();
        break;
      case 'X':
        dahs();
        dits();
        dits();
        dahs();
        break;
      case 'Y':
        dahs();
        dahs();
        dits();
        dahs();
        break;
      case 'Z':
        dahs();
        dahs();
        dits();
        dits();
        break;
      case '1':
        dits();
        dahs();
        dahs();
        dahs();
        dahs();
        break;
      case '2':
        dits();
        dits();
        dahs();
        dahs();
        dahs();
        break;
      case '3':
        dits();
        dits();
        dits();
        dahs();
        dahs();
        break;
      case '4':
        dits();
        dits();
        dits();
        dits();
        dahs();
        break;
      case '5':
        dits();
        dits();
        dits();
        dits();
        dits();
        break;
      case '6':
        dahs();
        dits();
        dits();
        dits();
        dits();
        break;
      case '7':
        dahs();
        dahs();
        dits();
        dits();
        dits();
        break;
      case '8':
        dahs();
        dahs();
        dahs();
        dits();
        dits();
        break;
      case '9':
        dahs();
        dahs();
        dahs();
        dahs();
        dits();
        break;
      case '0':
        dahs();
        dahs();
        dahs();
        dahs();
        dahs();
        break;
      case ' ':
        delay(3000);
      default:
        break;
    }
  }
  delay(10000);
}

void dahs()
{
  digitalWrite(13, HIGH);
  tone(13, 493, 1500);
  delay(1500);
  digitalWrite(13, LOW);
  delay(500);
}

void dits()
{
  digitalWrite(13, HIGH);
  tone(13, 493, 500);
  delay(500);
  digitalWrite(13, LOW);
  delay(500);
}