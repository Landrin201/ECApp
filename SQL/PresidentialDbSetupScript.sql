--Be sure to add a presidents database with a user who can edit it

--DROP TABLE presidents.state;

CREATE TABLE presidents.state (
	state_id int unique generated always as identity,
	state_name varchar(255) unique NOT NULL,
	abbreviation varchar(255) unique NOT null,
	year_joined integer NOT NULL,
	current_population varchar(255) NOT NULL
);

--DROP TABLE presidents.candidate;

CREATE TABLE presidents.candidate (
	candidate_id int unique generated always as identity,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	middle_name varchar(255),
	year_born int not null
);

--drop table presidents.election_years;

create table presidents.election_years(
	election_year int unique primary key

	);

--drop table presidents.electors_info;

create table presidents.electors_info(
	elector_info_id int unique generated always as identity,
	state_id int not null,
	num_electors int not null,
	election_year int not null,
	constraint fk_state_id
		foreign key(state_id)
			references presidents.state(state_id),
	constraint fk_election_year
		foreign key(election_year)
			references presidents.election_years(election_year)
);

--drop table presidents.eligibility;

create table presidents.eligibility(
	eligibility_id int unique generated always as identity,
	state_id int not null,
	election_year int not null,
	eligible_population int,
	registered_voters int,
	total_votes_cast int not null,
	constraint fk_state_id
		foreign key(state_id)
			references presidents.state(state_id),
	constraint fk_election_year
		foreign key(election_year)
			references presidents.election_years(election_year)
);

--drop table presidents.census_info;

create table presidents.census_info(
	census_info_id int unique generated always as identity,
	census_year int not null,
	state_id int not null,
	population int not null,
	constraint fk_state_id
		foreign key(state_id)
			references presidents.state(state_id)
);

--drop table presidents.candidate_results;

create table presidents.candidate_results(
	result_id int unique generated always as identity,
	election_year int not null,
	state_id int not null,
	candidate_id int not null,
	number_of_votes int not null,
	constraint fk_state_id
		foreign key(state_id)
			references presidents.state(state_id),
	constraint fk_election_year
		foreign key(election_year)
			references presidents.election_years(election_year),
	constraint fk_candidate_id
		foreign key(candidate_id)
			references presidents.candidate(candidate_id)	
);


commit;






