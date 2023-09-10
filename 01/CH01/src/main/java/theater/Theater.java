package theater;

public class Theater {
    private final TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * Theater 에서 bag, ticket office 에 의존하고 있다.
     * bag 또는 ticket seller 의 내부 로직이 변경되면 enter 로직도 함께 변경되어야 한다.
     */

    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {
            // 의사소통
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            // 변경
            audience.getBag().setTicket(ticket);
        } else {
            // 의사소통
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            // 변경
            audience.getBag().minusAmount(ticket.getFee());
            // 의사소통
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            // 변경
            audience.getBag().setTicket(ticket);
        }
    }
}
