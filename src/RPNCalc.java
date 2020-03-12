import java.util.Stack;

public class RPNCalc {

    public double calculate(String line) {
    	Stack<String> stack = new Stack<String>();
        String n, n1, n2;
        double d = 0, d1 = 0, d2 = 0;
       
        String elements[] = line.split(" ");

        for (String e : elements) {
            // Distinguir entre operador y operando
            switch (e) {
            case "+":
                n1 = stack.pop();
                d1 = Double.parseDouble(n1);
                System.out.println(d1);
                n2 = stack.pop();
                d2 = Double.parseDouble(n2);
                System.out.println(d2);
                d = d1 + d2;
                System.out.println(d);
                n = String.valueOf(d);
                stack.push(n);
                break;
            case "-":
                n1 = stack.pop();
                d1 = Double.parseDouble(n1);
                n2 = stack.pop();
                d2 = Double.parseDouble(n2);
                d = d1 - d2;
                n = String.valueOf(d);
                stack.push(n);
                break;
            case "*":
                n1 = stack.pop();
                d1 = Double.parseDouble(n1);
                n2 = stack.pop();
                d2 = Double.parseDouble(n2);
                d = d1 * d2;
                n = String.valueOf(d);
                stack.push(n);
                break;
            case "/":
                n1 = stack.pop();
                d1 = Double.parseDouble(n1);
                n2 = stack.pop();
                d2 = Double.parseDouble(n2);
                d = d1 / d2;
                n = String.valueOf(d);
                stack.push(n);
                break;
            default:
                stack.push(e);
                System.out.println(stack);
                break;
            }
            
        }

        return d;
    }
}

