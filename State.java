import java.util.Scanner;

public class State {
	int wide;
	int lenth;
	int place[][];
	public State(int wid,int len){
		wide=wid;
		lenth=len;
		place=new int[wid][len];
		for(int i=0;i<wid;i++){
			for(int j=0;j<len;j++){
				place[i][j]=0;
			}
		}
	}
	public void GiveState(){
		System.out.println("请输入小动物的类型与位置");
		int kind=-1;
		int x=-1;
		int y=-1;
		Scanner cin=new Scanner(System.in);
		kind=cin.nextInt();
		while(kind!=-1){
			x=cin.nextInt();
			y=cin.nextInt();
			place[x][y]=kind;
			kind=cin.nextInt();
		}
	}
	public void Print(){
		for(int i=0;i<wide;i++){
			for(int j=0;j<lenth;j++){
				System.out.print(place[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入地图的长款");
		int len=0;
		int wid=0;
		len=cin.nextInt();
		wid=cin.nextInt();
		State sta=new State(wid,len);
		sta.GiveState();
		sta.Print();
	}

}
