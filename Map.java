import java.util.ArrayList;


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
					System.out.print("--");
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
				System.out.print("--");
			}
		}
	}
	public void createMap(){
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map=new Map(3,4);
		map.print();
	}

}
