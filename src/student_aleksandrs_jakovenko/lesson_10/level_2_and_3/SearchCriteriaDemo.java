package student_aleksandrs_jakovenko.lesson_10.level_2_and_3;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearCriteria);
    }
}
