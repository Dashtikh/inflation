package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import java.sql.Connection;
import java.sql.SQLException;


public class LineChart {
    private Connection conn = Config.getConnect();

    public LineChart(String dbname) throws SQLException, ClassNotFoundException {

        String q = "select year,inf from " + dbname;
        JDBCCategoryDataset cds = new JDBCCategoryDataset(conn, q);
        JFreeChart chart = ChartFactory.createLineChart("inflation line chart", "year", "inflation", cds, PlotOrientation.VERTICAL, false, true, true);
        ChartFrame frm = new ChartFrame("inflation line chart0", chart);
        frm.setSize(500, 500);
        frm.setVisible(true);


    }

}
