class binarysearch
	{
	 public static void  binarysearch(int arr[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
			     first=mid+1;
			}
			else if(arr[mid]==key)
		          {
			system.out.println("Element is found at index:"+mid);
			break;
		           }
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)