import java.util.ArrayList;
import java.util.Scanner;


public class Map {
    int length;
    int wide;
	int[][] land;
	int[][] carwl_row;
	int[][] carwl_col;
	public Map(int wid,int len){
		length=len;
		wide=wid;
		land=new int[wid][len];
		carwl_row=new int[wid+1][len];
		carwl_col=new int[wid][len+1];
		for(int i=0;i<wid;i++){
			for(int j=0;j<len;j++){
				land[i][j]=1;
			}
		}
		for(int i=0;i<wid+1;i++){
			for(int j=0;j<len;j++){
				carwl_row[i][j]=0;
			}
		}
		for(int i=0;i<wid;i++){
			for(int j=0;j<len+1;j++){
				carwl_col[i][j]=0;
			}
		}
	}
	public void print(){
		for(int i=0;i<wide;i++){
			for(int j=0;j<length;j++){
				if(carwl_row[i][j]==1){
					System.out.print(" -");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
			for(int j=0;j<length;j++){
				if(carwl_col[i][j]==1){
					System.out.print("|");
				}
				else{
				System.out.print(" ");	
				}
				System.out.print(land[i][j]);
			}
			if(carwl_col[i][length]==1){
				System.out.println("|");
			}
			else{
				System.out.println("");
			}
		}
		for(int j=0;j<length;j++){
			if(carwl_row[wide][j]==1){
				System.out.print(" -");
			}
			else{
				System.out.print("  ");
			}
		}
	}
	public void createMap(){
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入坑的横纵坐标");
		int x=-1;
		int y=-1;
		x=cin.nextInt();
		y=cin.nextInt();
		while(x!=-1||y!=-1){
			land[x][y]=0;
			x=cin.nextInt();
			y=cin.nextInt();
		}
		System.out.println("请输入横向栏杆的横纵坐标");
		x=-1;
		y=-1;
		x=cin.nextInt();
		y=cin.nextInt();
		while(x!=-1||y!=-1){
			carwl_row[x][y]=1;
			x=cin.nextInt();
			y=cin.nextInt();
		}
		System.out.println("请输入纵向栏杆的横纵坐标");
		x=-1;
		y=-1;
		x=cin.nextInt();
		y=cin.nextInt();
		while(x!=-1||y!=-1){
			carwl_col[x][y]=1;
			x=cin.nextInt();
			y=cin.nextInt();
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner cin=new Scanner(System.in);
		System.out.println("请输入地图的长与宽");
		int len=cin.nextInt();
		int wid=cin.nextInt();
		Map map=new Map(wid,len);
		map.createMap();
		map.print();
	}

}
