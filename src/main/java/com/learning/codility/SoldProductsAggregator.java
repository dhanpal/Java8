//package com.learning.codility;
//
//import java.math.BigDecimal;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class SoldProductsAggregator {
//
//    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {
//List<SoldProduct> productNames = products.collect(Collectors.toList());
//    	
//    	Set<String> names = productNames.stream()
//    			.map(p -> p.getName())
//    			.collect(Collectors.toSet());
//
//    	SoldProductsAggregate productsAggregateFinal;
//    	
//    	names.forEach(name -> {
//    		List<SoldProduct> sample = productNames.stream()
//    		.filter(p -> p.getName().equals(name))
//    	    .collect(Collectors.toList());
//    		
//    		List<SimpleSoldProduct> sampleProducts = new ArrayList<>();
//    		
//    		BigDecimal total = BigDecimal.ZERO;;
//    		
//    		for(SoldProduct s : sample){
//              
//			
////    			SimpleSoldProduct simpleSoldProduct = new SimpleSoldProduct(s.getName(), s.getPrice());
//    			// simpleSoldProduct.setName(s.getName());
//    			// simpleSoldProduct.setPrice(s.getPrice());
////    			sampleProducts.add(simpleSoldProduct);
//    		}
////            SoldProductsAggregate productsAggregate = new SoldProductsAggregate(sampleProducts, total);
//			
//// need to assign this value to return parameter
//    	}
//    	
//    	);
//        
//        return productsAggregateFinal;
//    }
//
//    public SoldProductsAggregate map(SoldProduct soldProduct){
//    	SoldProductsAggregate aggregate = new SoldProductsAggregate();
//    	
//    	
//    	return aggregate;
//    }
//    
//}
//
//
//
//class SoldProduct {
//	  String name;
//	  public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	public String getCurrency() {
//		return currency;
//	}
//	public void setCurrency(String currency) {
//		this.currency = currency;
//	}
//	BigDecimal price;
//	  String currency;
//	}
//
//class SoldProductsAggregate {
//	  List<SimpleSoldProduct> products;
//	  BigDecimal total;
//	public List<SimpleSoldProduct> getProducts() {
//		return products;
//	}
//	public void setProducts(List<SimpleSoldProduct> products) {
//		this.products = products;
//	}
//	public BigDecimal getTotal() {
//		return total;
//	}
//	public void setTotal(BigDecimal total) {
//		this.total = total;
//	}
//	}
//
//class SimpleSoldProduct {
//	  String name;
//	  public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	BigDecimal price;
//	}