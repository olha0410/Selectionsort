public int[] selectionsort(int[] list) {
    int min;
    int storage;
    for (int i=0; i<list.length-1; i++) {
      min = i;
      for (int k=i+1; k<list.length; k++) {
        if (list[min] > list[k]) {
          min = k;
         }
       }
       storage = list[min];
       list[min] = list[i];
       list[i] = storage;
     }
     return list;
   }