
package agd6;
    import javax.swing.JOptionPane;

class Agd6 {
  public static void main(String[] args) {
   int age;
   String nome;

  nome = JOptionPane.showInputDialog("Digite o seu nome.");
  age = Integer.parseInt(JOptionPane.showInputDialog("Olá, "+ nome +", agora digite sua idade."));

  switch (age){
    case 80:
    case 81:
    case 82:
    case 83:
    case 84:
    case 85:
      JOptionPane.showMessageDialog(null, nome +", sua vacinação será na segunda-feira.");
      break;
    case 75:
    case 76:
    case 77:
    case 78:
    case 79:
      JOptionPane.showMessageDialog(null,nome +", sua vacinação será na terça-feira.");
      break;
    case 70:
    case 71:
    case 72:
    case 73:
    case 74:
      JOptionPane.showMessageDialog(null, nome +", sua vacinação será na quarta-feira.");
      break;
    case 65:
    case 66:
    case 67:
    case 68:
    case 69:
      JOptionPane.showMessageDialog(null, nome +", sua vacinação será na quinta-feira.");
      break;
    case 60:
    case 61:
    case 62:
    case 63:
    case 64:
      JOptionPane.showMessageDialog(null, nome +", sua vacinação será na sexta-feira");
    default:
      JOptionPane.showMessageDialog(null, nome+ ", você está fora do período de vacinação.");
          break;
       }
    
  


    
   }
}