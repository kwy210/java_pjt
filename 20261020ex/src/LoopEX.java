System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");

int offset = 3;
int day = 1;

for (int j = 0; j < 7 - offset; j++) {
    if (day <= 30) {
        System.out.print(String.format("%3d\t", day));
        day++;
    } else {
        System.out.print(String.format("%3s\t", "-"));
    }
}

offset = 0;
System.out.println();

}
}
		
		
		