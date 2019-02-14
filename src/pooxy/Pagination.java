package pooxy;

import javax.servlet.http.HttpServletRequest;
import lombok.Data;
import service.CustomerServiceImpl;
@Data
public class Pagination implements Proxy{
	private int pageNum,pageSize,
			blockSize,
			startRow,endRow,
			startPage,endPage,
			prevBlock,nextBlock,totalCount;
	private boolean existPrev, existNext;
	
	@Override
	public void carryOut(Object o) {
		System.out.println("페이지네이션 내부 ");
		HttpServletRequest request = (HttpServletRequest) o;
		System.out.println("page_size : "+ request.getParameter("page_size"));
		System.out.println("page_num : "+ request.getParameter("page_num"));
		pageSize = (request.getParameter("page_size") == null)	? 5 : Integer.parseInt(request.getParameter("page_size"));
		pageNum = (request.getParameter("page_num") == null) ? 1 : Integer.parseInt(request.getParameter("page_num"));
		totalCount = CustomerServiceImpl.getInstance().countCustomers(null);
		int pageCount = (totalCount % pageSize != 0) ?  totalCount/pageSize+1:totalCount/pageSize;
		System.out.println("전체 페이지수: "+pageCount);
		startRow = (pageNum -1) *pageSize + 1;
		System.out.println("스타트로우: "+startRow);
		endRow = (totalCount > pageNum * pageSize)? pageNum * pageSize: totalCount;
		System.out.println("엔드로우: "+endRow);
		
		startPage = pageNum - (pageNum-1);
		endPage = blockSize;
		
		existNext = (startPage + pageSize) <= pageCount;
		existPrev = (startPage -pageSize) > 0 ;
		
		prevBlock = startPage - pageSize;
		nextBlock = startPage + pageSize;
		
	}
}
