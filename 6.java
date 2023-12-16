import java.util.*;
public class DiceRollSimulator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Random rand=new Random(100);
HashMap<Integer,Integer> dict=new HashMap<>();
for(int i=1;i<=6;i++)
dict.put(i,0);
System.out.print("Enter the value of N: ");
int n=sc.nextInt();
System.out.println("Counts of doubles for each pair:");
for(int i=0;i<n;i++){
int rand1=rand.nextInt(6) +1;
int rand2=rand.nextInt(6) +1;
if(rand1==rand2){
int count=dict.get(rand1);
dict.put(rand1,++count);
}
}
for (HashMap.Entry<Integer, Integer> set :dict.entrySet()){
if (set.getValue() !=0)
System.out.println(set.getKey()+"-"+set.getKey()+":
"+set.getValue());
}
}
}
