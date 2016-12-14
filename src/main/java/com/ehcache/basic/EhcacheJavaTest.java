package com.ehcache.basic;
//http://www.ehcache.org/documentation/3.2/getting-started.html
import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;



public class EhcacheJavaTest {
public static void main(String[] args) {
	CacheManager cacheManager
    = CacheManagerBuilder.newCacheManagerBuilder() 
    .withCache("preConfigured",
        CacheConfigurationBuilder.newCacheConfigurationBuilder(Long.class, String.class, ResourcePoolsBuilder.heap(10))) 
    .build();
	cacheManager.init();
	Cache<Long, String> preConfigured = cacheManager.getCache("preConfigured", Long.class, String.class);
	Cache<Long, String> myCache = cacheManager.createCache("myCache", 
		    CacheConfigurationBuilder.newCacheConfigurationBuilder(Long.class, String.class, ResourcePoolsBuilder.heap(10)).build());
	myCache.put(1L, "da one!"); 
	preConfigured.put(2L, "test");
	System.out.println(preConfigured.get(2L));
	String value = myCache.get(1L); 
	System.out.println(value);

	cacheManager.removeCache("preConfigured"); 
//	System.out.println(preConfigured.get(2L));

	cacheManager.close();
}
}
