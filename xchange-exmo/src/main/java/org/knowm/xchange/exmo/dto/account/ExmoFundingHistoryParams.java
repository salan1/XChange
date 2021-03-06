package org.knowm.xchange.exmo.dto.account;

import org.knowm.xchange.service.trade.params.TradeHistoryParams;

import java.util.Date;

/**
 * The API returns funding for a particular day only (it does not support a date range)
 */
public class ExmoFundingHistoryParams implements TradeHistoryParams {
    public final Date day;

    public ExmoFundingHistoryParams(Date day) {
        this.day = day;
    }

    public Date getDay() {
        return day;
    }
}
