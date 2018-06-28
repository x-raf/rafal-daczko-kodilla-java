package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Bike");
        Product product2 = new Product("Scooter");

        Invoice invoice = new Invoice("FV 18/2018");

        Item item1 = new Item(product1,new BigDecimal(1700),1);
        Item item2 = new Item(product2, new BigDecimal(3200),1);

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);
        product1.setItems(items1);

        List<Item> items2 = new ArrayList<>();
        items2.add(item2);
        product2.setItems(items2);

        List<Item> itemsAll = new ArrayList<>();
        itemsAll.add(item1);
        itemsAll.add(item2);
        invoice.setItems(itemsAll);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);

        productDao.save(product1);
        productDao.save(product2);

        itemDao.save(item1);
        Item savedItem = itemDao.save(item2);
        //Then
        Assert.assertNotNull(savedItem.getId());
        Assert.assertNotEquals(0,savedItem.getId());
        //CleanUp
    }
}
