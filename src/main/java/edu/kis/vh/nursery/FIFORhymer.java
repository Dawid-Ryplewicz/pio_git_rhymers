package edu.kis.vh.nursery;

/**
 * Klasa tworząca wyliczankę jako kolejkę FIFO
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }


    /**
     * Podaje element z wyliczanki
     *
     * @return Element z wyliczanki, -1 jeżeli jest pusta
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
