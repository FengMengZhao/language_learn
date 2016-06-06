package org.fmz.algorithm ;

public class SquareMatrixMultiplyRecursive{
	public static Integer[][] squareMatrixMultiplyRecurisive(Integer[][] A, Integer[][] B){
		int row = A[0].length ;
		Integer[][] C = new Integer[row][row] ;
		if(row == 1){
			C[0][0] = A[0][0]*B[0][0] ;
			return C ;
		}else{
			Integer[][] A11 = new Integer[row/2][row/2] ;
			Integer[][] A12 = new Integer[row/2][row/2] ;
			Integer[][] A21 = new Integer[row/2][row/2] ;
			Integer[][] A22 = new Integer[row/2][row/2] ;
			Integer[][] B11 = new Integer[row/2][row/2] ;
			Integer[][] B12 = new Integer[row/2][row/2] ;
			Integer[][] B21 = new Integer[row/2][row/2] ;
			Integer[][] B22 = new Integer[row/2][row/2] ;

			split(A, A11, 0, 0) ;
			split(A, A12, row/2, 0) ;
			split(A, A21, 0, row/2) ;
			split(A, A22, row/2, row/2) ;
			split(B, B11, 0, 0) ;
			split(B, B12, row/2, 0) ;
			split(B, B21, 0, row/2) ;
			split(B, B22, row/2, row/2) ;

			Integer[][] C11 = new Integer[row/2][row/2] ;
			Integer[][] C12 = new Integer[row/2][row/2] ;
			Integer[][] C21 = new Integer[row/2][row/2] ;
			Integer[][] C22 = new Integer[row/2][row/2] ;

			C11 = add(squareMatrixMultiplyRecurisive(A11, B11), squareMatrixMultiplyRecurisive(A12, B12)) ;
			C12 = add(squareMatrixMultiplyRecurisive(A11, B12), squareMatrixMultiplyRecurisive(A12, B22)) ;
			C21 = add(squareMatrixMultiplyRecurisive(A21, B11), squareMatrixMultiplyRecurisive(A22, B21)) ;
			C22 = add(squareMatrixMultiplyRecurisive(A21, B12), squareMatrixMultiplyRecurisive(A22, B22)) ;
			
			join(C, C11, 0, 0) ;
			join(C, C12, row/2, 0) ;
			join(C, C21, 0 , row/2) ;
			join(C, C22, row/2, row/2) ;
		}
		return C ;
	}

	private static Integer[][] split(Integer[][] P, Integer[][] C, int iB, int jB){
		for(int i1=0, i2=iB; i1<C.length; i1++, i2++){
			for(int j1=0, j2=jB; j1<C.length; j1++, j2++){
				C[i1][j1] = P[i2][j2] ;
			}
		}
		return C ;
	}

	private static Integer[][] add(Integer[][] A, Integer[][] B){
		Integer[][] C = new Integer[A.length][B.length] ;
		for(int i=0; i<A.length; i++){
			for(int j=0; j<B.length; j++){
				C[i][j] = A[i][j] + B[i][j] ;
			}
		}
		return C ;
	}

	private static void join(Integer[][] P, Integer[][] C, int iB, int jB){
		for(int i1=0, i2=iB; i1<C.length; i1++, i2++){
			for(int j1=0, j2=jB; j1<C.length; j1++, j2++){
				P[i2][j2] = C[i1][j1];
			}
		}
	}

	public static void main(String args[]){
		Integer[][] A = {{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8},
							{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}} ;
		Integer[][] B = {{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8},
							{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}} ;
		//Integer[][] A = {{1,2}, {1,2}} ;
		//Integer[][] B = {{1,2}, {1,2}} ;
		Integer[][] C = squareMatrixMultiplyRecurisive(A, B) ;

		for(Integer[] i : C){
			for(Integer j : i){
				System.out.print(j + "\t") ;
			}
			System.out.println() ;
		}
	}
}/* Output:
	8       24      48      80      120     168     224     288
	12      24      60      80      140     168     252     288
	16      40      48      80      160     216     224     288
	20      40      60      80      180     216     252     288
	24      56      96      144     120     168     224     288
	28      56      108     144     140     168     252     288
	32      72      96      144     160     216     224     288
	36      72      108     144     180     216     252     288
*/